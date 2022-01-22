%nnCostFunction

function [J grad] = nnCostFunction(nn_params, ...
                                   input_layer_size, ...
                                   hidden_layer_size, ...
                                   num_labels, ...
                                   X, y, lambda)
                                                                      
                                                                     
% Reshape nn_params back into the parameters Theta1 and Theta2, the weight matrices
% for our 2 layer neural network
Theta1 = reshape(nn_params(1:hidden_layer_size * (input_layer_size + 1)), ...
                 hidden_layer_size, (input_layer_size + 1));

Theta2 = reshape(nn_params((1 + (hidden_layer_size * (input_layer_size + 1))):end), ...
                 num_labels, (hidden_layer_size + 1));
                 

% size of samples                 
m = size(X,1);

J = 0;
Theta1_grad = zeros(size(Theta1));
Theta2_grad = zeros(size(Theta2));

% Part 1 : return cost J
% Part 2 : return grad
% Part 3 : regularization

Xtemp = [ones(size(X,1),1) X];
Z1 = Xtemp * Theta1';
A2 = sigmoid(Z1);

A2temp = [ones(size(A2,1),1) A2];
Z2 = A2temp * Theta2';
A3 = sigmoid(Z2);

ymask = zeros(size(y,1),num_labels);
for i=1:1:size(y,1)
  ymask(i,y(i,1)) = 1;
end

temp = sum((-ymask).*log(A3) - (1-ymask).*log(1-A3),2);
Theta1sq = Theta1(:,2:end) .^2;
Theta2sq = Theta2(:,2:end) .^2;
reg = (lambda/(2*m)) *(sum(Theta1sq(:)) + sum(Theta2sq(:)) );

J = (1/m)*sum(temp,1) + reg;

% compute grad
sigma3 = A3-ymask;

sigma2 = (sigma3*Theta2).*sigmoidGradient([ones(size(Z1,1),1) Z1]);
sigma2 = sigma2(:,2:end);

delta1 = sigma2' * Xtemp;
delta2 = sigma3' * [ones(size(A2,1),1) A2];

p1 = (lambda/m).*[zeros(size(Theta1, 1), 1) Theta1(:, 2:end)];
p2 = (lambda/m).*[zeros(size(Theta2, 1), 1) Theta2(:, 2:end)];

Theta1_grad = delta1./m +p1;
Theta2_grad = delta2./m +p2;



% Unroll gradients
grad = [Theta1_grad(:) ; Theta2_grad(:)];

end