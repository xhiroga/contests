% for digit recognition




% Load Training Data
fprintf('Loading and Visualizing Data ...\n')

%test.csv data is 28001 x 784, each row show 28 x 28 grayscale and each element have 0~255.
data = csvread('train.csv');

m = size(data);

% Randomly select 100 data points to display
sel = randperm(size(data, 1));
sel = sel(1:100);

pause;

%cut down data
data_mini = data(1:100,:);

X = data_mini(2:end,:);
y = data_mini(1,:);


%%% 3 leayer NN. 1st layer. Hidden layer is 30 Theta1 is 785 X 30. Theta2 is 31 X 10

%setting params for compute


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