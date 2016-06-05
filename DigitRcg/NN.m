% for digit recognition




% Load Training Data
fprintf('Loading and Visualizing Data ...\n')

%test.csv data is 28001 x 784, each row show 28 x 28 grayscale and each element have 0~255.
data = csvread('train_1000.csv');

m = size(data);
fprintf('Size file = '), disp(m)

pause;

%remove label
data = data(2:end,:);

X = data(2:end,2:end);
y = data(2:end,1);

% change 0 to 10
for i=1:1:size(y,1)
  if(y(i,1) == 0)
    y(i,1) = 10;
  end
end

%%% 3 leayer NN. 1st layer. Hidden layer is 30 Theta1 is 785 X 30. Theta2 is 31 X 10
fprintf('Stsrt computing ...\n')

%layer size is 
input_layer_size = size(X,2);
hidden_layer_size = 30;
num_labels = 10;

%initial theta
Theta1 = rand(input_layer_size+1,hidden_layer_size);
Theta2 = rand(hidden_layer_size+1,num_labels);

nn_params = [Theta1(:) ; Theta2(:)];
lambda = 0;

J = nnCostFunction(nn_params, input_layer_size, hidden_layer_size, ...
                   num_labels, X, y, lambda);
                                                                 
J                                   

fprintf('Program paused. Press enter to continue.\n');
pause;


%% =================== Part 8: Training NN ===================
%  You have now implemented all the code necessary to train a neural 
%  network. To train your neural network, we will now use "fmincg", which
%  is a function which works similarly to "fminunc". Recall that these
%  advanced optimizers are able to train our cost functions efficiently as
%  long as we provide them with the gradient computations.
%
fprintf('\nTraining Neural Network... \n')

%  After you have completed the assignment, change the MaxIter to a larger
%  value to see how more training helps.
options = optimset('MaxIter', 50);

initial_Theta1 = Theta1;
initial_Theta2 = Theta2;
initial_nn_params = [initial_Theta1(:) ; initial_Theta2(:)];

%  You should also try different values of lambda
lambda = 1;

% Create "short hand" for the cost function to be minimized
costFunction = @(p) nnCostFunction(p, ...
                                   input_layer_size, ...
                                   hidden_layer_size, ...
                                   num_labels, X, y, lambda);

% Now, costFunction is a function that takes in only one argument (the
% neural network parameters)
[nn_params, cost] = fmincg(costFunction, initial_nn_params, options);

% Obtain Theta1 and Theta2 back from nn_params
Theta1 = reshape(nn_params(1:hidden_layer_size * (input_layer_size + 1)), ...
                 hidden_layer_size, (input_layer_size + 1));

Theta2 = reshape(nn_params((1 + (hidden_layer_size * (input_layer_size + 1))):end), ...
                 num_labels, (hidden_layer_size + 1));

fprintf('Program paused. Press enter to continue.\n');
pause;

size(cost)
fprintf('Cost = \n'), disp(cost);



