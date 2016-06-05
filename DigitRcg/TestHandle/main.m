
x2 = 2;
x3 = 4;

fh = @(x1)math(x1,x2,x3);

for i=1:1:10
  ymin = ite(fh,i);
  disp(ymin)
end
